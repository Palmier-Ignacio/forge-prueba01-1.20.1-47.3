package net.naacho.Prueba01Mod.item.custom;

import net.minecraft.core.BlockPos;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.TieredItem;
import net.minecraft.world.item.Tiers;
import net.minecraft.world.item.context.BlockPlaceContext;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.phys.BlockHitResult;
import net.naacho.Prueba01Mod.item.ModToolTiers;
import org.jetbrains.annotations.Nullable;

public class StormBlock extends Block{
    public StormBlock(Properties properties) {
        super(properties);
    }

    @Override
    public InteractionResult use(BlockState state, Level level, BlockPos pos, Player player, InteractionHand hand, BlockHitResult hit) {
        if (!level.isClientSide && level instanceof ServerLevel serverLevel) { // Solo ejecuta en el servidor
            // Activa la lluvia y los truenos durante 5 minutos (6000 ticks)
            int duration = 1200 * 5; // 1200 ticks = 1 minuto
            serverLevel.setWeatherParameters(0, duration, true, true);

            return InteractionResult.SUCCESS; // Indica que la acción fue exitosa
        }
        return InteractionResult.PASS; // No hace nada en el cliente
    }

    @Override
    public @Nullable BlockState getStateForPlacement(BlockPlaceContext context) {
        return this.defaultBlockState();
    }
    @Override
    public void playerWillDestroy(Level level, BlockPos pos, BlockState state, Player player) {
        super.playerWillDestroy(level, pos, state, player);

        // Si la herramienta no es adecuada (no es rubi), evita que el bloque se rompa
        if (!isCorrectTool(player.getMainHandItem())) {
            level.removeBlock(pos, false); // Elimina el bloque sin dejar items
        }
    }

    // Metodo personalizado para verificar si la herramienta es correcta (solo rubi)
    public boolean isCorrectTool(ItemStack stack) {
        // Verifica si la herramienta tiene el Tier correcto (en este caso, rubi)
        if (stack.getItem() instanceof TieredItem) {
            // Compara el Tier de la herramienta con el de rubi
            return ((TieredItem) stack.getItem()).getTier() == ModToolTiers.RUBY; // Asegúrate de que RUBY está correctamente definido
        }
        return false; // Si no es una herramienta "Tiered", retorna false
    }
}
