package net.divinerpg.client.render.entity.twilight.model;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.util.MathHelper;

public class ModelCadillion extends ModelBase
{
    ModelRenderer body;
    ModelRenderer neck;
    ModelRenderer head;
    ModelRenderer horn;
    ModelRenderer mane;
    ModelRenderer nose;
    ModelRenderer jaw;
    ModelRenderer lleg1;
    ModelRenderer rleg1;
    ModelRenderer lleg1b2;
    ModelRenderer rleg1b2;
    ModelRenderer lhoof1;
    ModelRenderer rhoof1;
    ModelRenderer lleg2;
    ModelRenderer rleg2;
    ModelRenderer rleg2b2;
    ModelRenderer lleg2b2;
    ModelRenderer lhoof2;
    ModelRenderer rhoof2;
    ModelRenderer tail1;
    ModelRenderer tail2;
    ModelRenderer tail33;
    ModelRenderer lear;
    ModelRenderer rear;
    ModelRenderer body2;
    ModelRenderer mane2;
  
  public ModelCadillion()
  {
    textureWidth = 128;
    textureHeight = 64;
    
      body = new ModelRenderer(this, 56, 50);
      body.addBox(-2.5F, -3F, 0F, 5, 7, 7);
      body.setRotationPoint(0F, 13F, -5F);
      body.setTextureSize(128, 64);
      body.mirror = true;
      setRotation(body, 0F, 0F, 0F);
      neck = new ModelRenderer(this, 0, 20);
      neck.addBox(-1.5F, -9F, -3F, 3, 9, 5);
      neck.setRotationPoint(0F, 13F, -2F);
      neck.setTextureSize(128, 64);
      neck.mirror = true;
      setRotation(neck, 0.6981317F, 0F, 0F);
      head = new ModelRenderer(this, 0, 35);
      head.addBox(-2F, -10.5F, -4F, 4, 5, 5);
      head.setRotationPoint(0F, 13F, -2F);
      head.setTextureSize(128, 64);
      head.mirror = true;
      setRotation(head, 0.5934119F, 0F, 0F);
      horn = new ModelRenderer(this, 0, 47);
      horn.addBox(-0.5F, -15F, -2F, 1, 6, 1);
      horn.setRotationPoint(0F, 13F, -2F);
      horn.setTextureSize(128, 64);
      horn.mirror = true;
      setRotation(horn, 0.6108652F, 0F, 0F);
      mane = new ModelRenderer(this, 4, 45);
      mane.addBox(-0.5F, -9F, 0F, 1, 9, 3);
      mane.setRotationPoint(0F, 13F, -2F);
      mane.setTextureSize(128, 64);
      mane.mirror = true;
      setRotation(mane, 0.715585F, 0F, 0F);
      nose = new ModelRenderer(this, 16, 20);
      nose.addBox(-1.5F, -10.2F, -6.5F, 3, 3, 3);
      nose.setRotationPoint(0F, 13F, -2F);
      nose.setTextureSize(128, 64);
      nose.mirror = true;
      setRotation(nose, 0.5934119F, 0F, 0F);
      jaw = new ModelRenderer(this, 16, 27);
      jaw.addBox(-1F, -8F, -6F, 2, 2, 2);
      jaw.setRotationPoint(0F, 13F, -2F);
      jaw.setTextureSize(128, 64);
      jaw.mirror = true;
      setRotation(jaw, 0.5934119F, 0F, 0F);
      lleg1 = new ModelRenderer(this, 18, 34);
      lleg1.addBox(0F, -2F, -2.3F, 2, 6, 4);
      lleg1.setRotationPoint(1F, 15F, -3F);
      lleg1.setTextureSize(128, 64);
      lleg1.mirror = true;
      setRotation(lleg1, 0F, 0F, 0F);
      rleg1 = new ModelRenderer(this, 18, 44);
      rleg1.addBox(-2F, -2F, -2.3F, 2, 6, 4);
      rleg1.setRotationPoint(-1F, 15F, -3F);
      rleg1.setTextureSize(128, 64);
      rleg1.mirror = true;
      setRotation(rleg1, 0F, 0F, 0F);
      lleg1b2 = new ModelRenderer(this, 18, 54);
      lleg1b2.addBox(0F, 3F, -1.8F, 2, 5, 3);
      lleg1b2.setRotationPoint(1F, 15F, -3F);
      lleg1b2.setTextureSize(128, 64);
      lleg1b2.mirror = true;
      setRotation(lleg1b2, 0F, 0F, 0F);
      rleg1b2 = new ModelRenderer(this, 29, 54);
      rleg1b2.addBox(-2F, 3F, -1.8F, 2, 5, 3);
      rleg1b2.setRotationPoint(-1F, 15F, -3F);
      rleg1b2.setTextureSize(128, 64);
      rleg1b2.mirror = true;
      setRotation(rleg1b2, 0F, 0F, 0F);
      lhoof1 = new ModelRenderer(this, 31, 47);
      lhoof1.addBox(-0.5F, 7F, -2.5F, 3, 2, 4);
      lhoof1.setRotationPoint(1F, 15F, -3F);
      lhoof1.setTextureSize(128, 64);
      lhoof1.mirror = true;
      setRotation(lhoof1, 0F, 0F, 0F);
      rhoof1 = new ModelRenderer(this, 31, 41);
      rhoof1.addBox(-2.5F, 7F, -2.5F, 3, 2, 4);
      rhoof1.setRotationPoint(-1F, 15F, -3F);
      rhoof1.setTextureSize(128, 64);
      rhoof1.mirror = true;
      setRotation(rhoof1, 0F, 0F, 0F);
      lleg2 = new ModelRenderer(this, 31, 30);
      lleg2.addBox(0F, -2F, -2F, 2, 6, 4);
      lleg2.setRotationPoint(1F, 15F, 6.5F);
      lleg2.setTextureSize(128, 64);
      lleg2.mirror = true;
      setRotation(lleg2, 0F, 0F, 0F);
      rleg2 = new ModelRenderer(this, 31, 20);
      rleg2.addBox(-2F, -2F, -2F, 2, 6, 4);
      rleg2.setRotationPoint(-1F, 15F, 6.5F);
      rleg2.setTextureSize(128, 64);
      rleg2.mirror = true;
      setRotation(rleg2, 0F, 0F, 0F);
      rleg2b2 = new ModelRenderer(this, 37, 11);
      rleg2b2.addBox(-1F, 3F, -1.5F, 2, 5, 3);
      rleg2b2.setRotationPoint(-2F, 15F, 6.5F);
      rleg2b2.setTextureSize(128, 64);
      rleg2b2.mirror = true;
      setRotation(rleg2b2, 0F, 0F, 0F);
      lleg2b2 = new ModelRenderer(this, 36, 3);
      lleg2b2.addBox(0F, 3F, -1.5F, 2, 5, 3);
      lleg2b2.setRotationPoint(1F, 15F, 6.5F);
      lleg2b2.setTextureSize(128, 64);
      lleg2b2.mirror = true;
      setRotation(lleg2b2, 0F, 0F, 0F);
      lhoof2 = new ModelRenderer(this, 40, 57);
      lhoof2.addBox(-0.5F, 7F, -2F, 3, 2, 4);
      lhoof2.setRotationPoint(1F, 15F, 6.5F);
      lhoof2.setTextureSize(128, 64);
      lhoof2.mirror = true;
      setRotation(lhoof2, 0F, 0F, 0F);
      rhoof2 = new ModelRenderer(this, 47, 0);
      rhoof2.addBox(-2.5F, 7F, -2F, 3, 2, 4);
      rhoof2.setRotationPoint(-1F, 15F, 6.5F);
      rhoof2.setTextureSize(128, 64);
      rhoof2.mirror = true;
      setRotation(rhoof2, 0F, 0F, 0F);
      tail1 = new ModelRenderer(this, 47, 6);
      tail1.addBox(-1F, 0F, -0.5F, 2, 3, 2);
      tail1.setRotationPoint(0F, 11.5F, 7F);
      tail1.setTextureSize(128, 64);
      tail1.mirror = true;
      setRotation(tail1, 0.837758F, 0F, 0F);
      tail2 = new ModelRenderer(this, 44, 21);
      tail2.addBox(-1.5F, 2F, -0.3F, 3, 3, 3);
      tail2.setRotationPoint(0F, 11.5F, 7F);
      tail2.setTextureSize(128, 64);
      tail2.mirror = true;
      setRotation(tail2, 0.3665191F, 0F, 0F);
      tail33 = new ModelRenderer(this, 46, 40);
      tail33.addBox(-1.5F, 3.8F, 1.2F, 3, 6, 3);
      tail33.setRotationPoint(0F, 11.5F, 7F);
      tail33.setTextureSize(128, 64);
      tail33.mirror = true;
      setRotation(tail33, 0F, 0F, 0F);
      lear = new ModelRenderer(this, 0, 60);
      lear.addBox(0.7F, -13F, -0.2F, 1, 3, 1);
      lear.setRotationPoint(0F, 13F, -2F);
      lear.setTextureSize(128, 64);
      lear.mirror = true;
      setRotation(lear, 0.5934119F, 0F, 0F);
      rear = new ModelRenderer(this, 13, 52);
      rear.addBox(-1.7F, -13F, -0.2F, 1, 3, 1);
      rear.setRotationPoint(0F, 13F, -2F);
      rear.setTextureSize(128, 64);
      rear.mirror = true;
      setRotation(rear, 0.5934119F, 0F, 0F);
      body2 = new ModelRenderer(this, 0, 0);
      body2.addBox(-2F, -2.5F, 0F, 4, 6, 8);
      body2.setRotationPoint(0F, 13F, 0F);
      body2.setTextureSize(128, 64);
      body2.mirror = true;
      setRotation(body2, 0F, 0F, 0F);
      mane2 = new ModelRenderer(this, 61, 42);
      mane2.addBox(-0.5F, -11F, 0F, 1, 4, 3);
      mane2.setRotationPoint(0F, 13F, -2F);
      mane2.setTextureSize(128, 64);
      mane2.mirror = true;
      setRotation(mane2, 0.715585F, 0F, 0F);
  }
  
  public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5)
  {
    super.render(entity, f, f1, f2, f3, f4, f5);
    setRotationAngles(f, f1, f2, f3, f4, f5);
    body.render(f5);
    neck.render(f5);
    head.render(f5);
    horn.render(f5);
    mane.render(f5);
    nose.render(f5);
    jaw.render(f5);
    lleg1.render(f5);
    rleg1.render(f5);
    lleg1b2.render(f5);
    rleg1b2.render(f5);
    lhoof1.render(f5);
    rhoof1.render(f5);
    lleg2.render(f5);
    rleg2.render(f5);
    rleg2b2.render(f5);
    lleg2b2.render(f5);
    lhoof2.render(f5);
    rhoof2.render(f5);
    tail1.render(f5);
    tail2.render(f5);
    tail33.render(f5);
    lear.render(f5);
    rear.render(f5);
    body2.render(f5);
    mane2.render(f5);
  }
  
  private void setRotation(ModelRenderer model, float x, float y, float z)
  {
    model.rotateAngleX = x;
    model.rotateAngleY = y;
    model.rotateAngleZ = z;
  }
  
  public void setRotationAngles(float var1, float var2, float var3, float var4, float var5, float var6)
  {
      this.head.rotateAngleY = var4 / (180F / (float)Math.PI);
      this.jaw.rotateAngleY = var4 / (180F / (float)Math.PI);
      this.mane.rotateAngleY = var4 / (180F / (float)Math.PI);
      this.nose.rotateAngleY = var4 / (180F / (float)Math.PI);
      this.mane2.rotateAngleY = var4 / (180F / (float)Math.PI);
      this.neck.rotateAngleY = var4 / (180F / (float)Math.PI);
      this.horn.rotateAngleY = var4 / (180F / (float)Math.PI);
      this.lear.rotateAngleY = var4 / (180F / (float)Math.PI);
      this.rear.rotateAngleY = var4 / (180F / (float)Math.PI);
      //this.body.rotateAngleX = ((float)Math.PI / 2F);
      this.lleg1.rotateAngleX = MathHelper.cos(var1 * 0.6662F) * 1.4F * var2;
      this.lleg2.rotateAngleX = MathHelper.cos(var1 * 0.6662F + (float)Math.PI) * 1.4F * var2;
      this.rleg1.rotateAngleX = MathHelper.cos(var1 * 0.6662F + (float)Math.PI) * 1.4F * var2;
      this.rleg2.rotateAngleX = MathHelper.cos(var1 * 0.6662F) * 1.4F * var2;
      this.lleg1b2.rotateAngleX = MathHelper.cos(var1 * 0.6662F) * 1.4F * var2;
      this.lleg2b2.rotateAngleX = MathHelper.cos(var1 * 0.6662F + (float)Math.PI) * 1.4F * var2;
      this.rleg1b2.rotateAngleX = MathHelper.cos(var1 * 0.6662F + (float)Math.PI) * 1.4F * var2;
      this.rleg2b2.rotateAngleX = MathHelper.cos(var1 * 0.6662F) * 1.4F * var2;
      this.lhoof1.rotateAngleX = MathHelper.cos(var1 * 0.6662F) * 1.4F * var2;
      this.lhoof2.rotateAngleX = MathHelper.cos(var1 * 0.6662F + (float)Math.PI) * 1.4F * var2;
      this.rhoof1.rotateAngleX = MathHelper.cos(var1 * 0.6662F + (float)Math.PI) * 1.4F * var2;
      this.rhoof2.rotateAngleX = MathHelper.cos(var1 * 0.6662F) * 1.4F * var2;
  }

}