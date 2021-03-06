package net.divinerpg.client.render.block;

import net.divinerpg.Reference;
import net.divinerpg.client.render.block.model.ModelParasectaAltar;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.tileentity.TileEntitySpecialRenderer;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.ResourceLocation;

import org.lwjgl.opengl.GL11;

public class TileEntityParasectaAltarRenderer extends TileEntitySpecialRenderer {

	private ModelParasectaAltar model;

	public TileEntityParasectaAltarRenderer() {
		model = new ModelParasectaAltar();
	}

	@Override
	public void renderTileEntityAt(TileEntity var1, double x, double y, double z, float var8) {
		Minecraft.getMinecraft().getTextureManager().bindTexture(new ResourceLocation(Reference.PREFIX + "textures/model/parasectaAltar.png"));
		GL11.glPushMatrix();
		GL11.glTranslatef((float)x + 0.5F, (float)y - 0.6F, (float)z + 0.5F);
		model.render(0.0625F);
		GL11.glPopMatrix();
	}
}