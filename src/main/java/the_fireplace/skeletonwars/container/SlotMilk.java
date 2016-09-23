package the_fireplace.skeletonwars.container;

import net.minecraft.init.Items;
import net.minecraft.inventory.Slot;
import net.minecraft.item.ItemStack;
import the_fireplace.skeletonwars.tileentity.TileEntitySkeletonMaker;

/**
 * @author The_Fireplace
 */
public class SlotMilk extends Slot {
    TileEntitySkeletonMaker inv;

    public SlotMilk(TileEntitySkeletonMaker inventoryIn, int index, int xPosition,
                    int yPosition) {
        super(inventoryIn, index, xPosition, yPosition);
        inv = inventoryIn;
    }

    @Override
    public boolean isItemValid(ItemStack stack) {
        return stack.getItem().equals(Items.MILK_BUCKET);
    }
}
