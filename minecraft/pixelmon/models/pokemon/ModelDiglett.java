// Date: 5/6/2012 1:00:59 PM
// Template version 1.1
// Java generated by Techne
// Keep in mind that you still need to fill in some blanks
// - ZeuX
package pixelmon.models.pokemon;

import net.minecraft.src.*;

public class ModelDiglett extends ModelBase {
	// fields
	ModelRenderer body;
	ModelRenderer top;
	ModelRenderer mouth;
	ModelRenderer base;
	ModelRenderer rock1;
	ModelRenderer rock2;
	ModelRenderer rock3;

	public ModelDiglett() {
		textureWidth = 64;
		textureHeight = 32;

		body = new ModelRenderer(this, 0, 0);
		body.addBox(-3F, -6F, -3F, 6, 6, 6);
		body.setRotationPoint(0F, 23F, 0F);
		body.setTextureSize(64, 32);
		body.mirror = true;
		setRotation(body, 0F, 0F, 0F);
		top = new ModelRenderer(this, 24, 0);
		top.addBox(-2.5F, -7F, -2.5F, 5, 1, 5);
		top.setRotationPoint(0F, 23F, 0F);
		top.setTextureSize(64, 32);
		top.mirror = true;
		setRotation(top, 0F, 0F, 0F);
		mouth = new ModelRenderer(this, 24, 6);
		mouth.addBox(-1F, -2.5F, -4F, 2, 1, 1);
		mouth.setRotationPoint(0F, 23F, 0F);
		mouth.setTextureSize(64, 32);
		mouth.mirror = true;
		setRotation(mouth, 0F, 0F, 0F);
		base = new ModelRenderer(this, 0, 12);
		base.addBox(-4F, 0F, -4F, 8, 1, 8);
		base.setRotationPoint(0F, 23F, 0F);
		base.setTextureSize(64, 32);
		base.mirror = true;
		setRotation(base, 0F, 0F, 0F);
		rock1 = new ModelRenderer(this, 0, 12);
		rock1.addBox(-5F, -1F, 3F, 2, 2, 2);
		rock1.setRotationPoint(0F, 23F, 0F);
		rock1.setTextureSize(64, 32);
		rock1.mirror = true;
		setRotation(rock1, 0F, 0F, 0F);
		rock2 = new ModelRenderer(this, 0, 16);
		rock2.addBox(-5F, 0F, -2F, 1, 1, 1);
		rock2.setRotationPoint(0F, 23F, 0F);
		rock2.setTextureSize(64, 32);
		rock2.mirror = true;
		setRotation(rock2, 0F, 0F, 0F);
		rock3 = new ModelRenderer(this, 0, 18);
		rock3.addBox(2F, 0F, -5F, 1, 1, 1);
		rock3.setRotationPoint(0F, 23F, 0F);
		rock3.setTextureSize(64, 32);
		rock3.mirror = true;
		setRotation(rock3, 0F, 0F, 0F);
	}

	public void render(Entity entity, float f, float f1, float f2, float f3,
			float f4, float f5) {
		super.render(entity, f, f1, f2, f3, f4, f5);
		setRotationAngles(f, f1, f2, f3, f4, f5, entity);
		body.render(f5);
		top.render(f5);
		mouth.render(f5);
		base.render(f5);
		rock1.render(f5);
		rock2.render(f5);
		rock3.render(f5);
	}

	private void setRotation(ModelRenderer model, float x, float y, float z) {
		model.rotateAngleX = x;
		model.rotateAngleY = y;
		model.rotateAngleZ = z;
	}

	public void setRotationAngles(float f, float f1, float f2, float f3,
			float f4, float f5, Entity entity) {
		body.rotationPointY = MathHelper.cos(1.5F * f) * f1 + 23.5F;
		mouth.rotationPointY = MathHelper.cos(1.5F * f) * f1 + 23.5F;
		top.rotationPointY = MathHelper.cos(1.5F * f) * f1 + 23.5F;
		body.rotationPointZ = MathHelper.cos(1.5F * f) * f1;
		mouth.rotationPointZ = MathHelper.cos(1.5F * f) * f1;
		top.rotationPointZ = MathHelper.cos(1.5F * f) * f1;

	}

}
