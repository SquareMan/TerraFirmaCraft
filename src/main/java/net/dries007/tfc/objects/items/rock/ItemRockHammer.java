/*
 * Work under Copyright. Licensed under the EUPL.
 * See the project README.md and LICENSE.txt for more information.
 */

package net.dries007.tfc.objects.items.rock;

import java.util.EnumMap;
import java.util.List;
import javax.annotation.Nullable;

import com.google.common.collect.ImmutableSet;
import net.minecraft.client.util.ITooltipFlag;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemTool;
import net.minecraft.world.World;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

import net.dries007.tfc.objects.Rock;
import net.dries007.tfc.util.OreDictionaryHelper;

public class ItemRockHammer extends ItemTool
{
    private static final EnumMap<Rock.Category, ItemRockHammer> MAP = new EnumMap<>(Rock.Category.class);

    public static ItemRockHammer get(Rock.Category category)
    {
        return MAP.get(category);
    }

    public final Rock.Category category;

    public ItemRockHammer(Rock.Category category)
    {
        super(2f * category.toolMaterial.getAttackDamage(), -3.5f, category.toolMaterial, ImmutableSet.of());
        this.category = category;
        if (MAP.put(category, this) != null) throw new IllegalStateException("There can only be one.");
        setHarvestLevel("hammer", category.toolMaterial.getHarvestLevel());
        OreDictionaryHelper.register(this, "hammer");
        OreDictionaryHelper.register(this, "hammer", "stone");
        OreDictionaryHelper.register(this, "hammer", "stone", category);
    }

    @Override
    @SideOnly(Side.CLIENT)
    public void addInformation(ItemStack stack, @Nullable World worldIn, List<String> tooltip, ITooltipFlag flagIn)
    {
        tooltip.add("Rock type: " + OreDictionaryHelper.toString(category));
    }
}
