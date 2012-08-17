package net.minecraft.src;

import net.minecraft.client.Minecraft;
import org.lwjgl.opengl.GL11;

class GuiButtonNextPage extends GuiButton
{
    private final boolean field_73755_j;

    public GuiButtonNextPage(int par1, int par2, int par3, boolean par4)
    {
        super(par1, par2, par3, 23, 13, "");
        this.field_73755_j = par4;
    }

    /**
     * Draws this button to the screen.
     */
    public void drawButton(Minecraft par1Minecraft, int par2, int par3)
    {
        if (this.drawButton)
        {
            boolean var4 = par2 >= this.xPosition && par3 >= this.yPosition && par2 < this.xPosition + this.width && par3 < this.yPosition + this.height;
            GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
            par1Minecraft.renderEngine.bindTexture(par1Minecraft.renderEngine.getTexture("/gui/book.png"));
            int var5 = 0;
            int var6 = 192;

            if (var4)
            {
                var5 += 23;
            }

            if (!this.field_73755_j)
            {
                var6 += 13;
            }

            this.drawTexturedModalRect(this.xPosition, this.yPosition, var5, var6, 23, 13);
        }
    }
}