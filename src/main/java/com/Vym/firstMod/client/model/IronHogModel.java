package com.Vym.firstMod.client.model;

import com.Vym.firstMod.entities.IronHogEntity;
import com.mojang.blaze3d.matrix.MatrixStack;
import com.mojang.blaze3d.vertex.IVertexBuilder;
import net.minecraft.client.renderer.entity.model.EntityModel;
import net.minecraft.client.renderer.model.ModelRenderer;
import net.minecraft.util.math.MathHelper;

public class IronHogModel<T extends IronHogEntity> extends EntityModel<T> {
    private final ModelRenderer front_legs;
    private final ModelRenderer back_legs;
    private final ModelRenderer head;
    private final ModelRenderer body;

    public IronHogModel() {
        textureWidth = 64;
        textureHeight = 64;

        front_legs = new ModelRenderer(this);
        front_legs.setRotationPoint(0.0F, 24.0F, 0.0F);
        front_legs.setTextureOffset(38, 40).addBox(-4.0F, -6.0F, 3.0F, 4.0F, 6.0F, 4.0F, 0.0F, false);
        front_legs.setTextureOffset(36, 0).addBox(2.0F, -6.0F, 3.0F, 4.0F, 6.0F, 4.0F, 0.0F, false);

        back_legs = new ModelRenderer(this);
        back_legs.setRotationPoint(0.0F, 24.0F, 0.0F);
        back_legs.setTextureOffset(26, 34).addBox(2.0F, -6.0F, -9.0F, 4.0F, 6.0F, 4.0F, 0.0F, false);
        back_legs.setTextureOffset(0, 0).addBox(-4.0F, -6.0F, -9.0F, 4.0F, 6.0F, 4.0F, 0.0F, false);

        head = new ModelRenderer(this);
        head.setRotationPoint(0.0F, 24.0F, 0.0F);
        head.setTextureOffset(38, 34).addBox(-1.0F, -12.0F, 14.0F, 4.0F, 3.0F, 1.0F, 0.0F, false);
        head.setTextureOffset(28, 44).addBox(-3.0F, -18.0F, 10.0F, 1.0F, 1.0F, 3.0F, 0.0F, false);
        head.setTextureOffset(20, 44).addBox(4.0F, -18.0F, 10.0F, 1.0F, 1.0F, 3.0F, 0.0F, false);
        head.setTextureOffset(0, 24).addBox(-5.0F, -17.0F, 9.0F, 12.0F, 1.0F, 6.0F, 0.0F, false);
        head.setTextureOffset(36, 10).addBox(-4.0F, -17.0F, 15.0F, 10.0F, 1.0F, 1.0F, 0.0F, false);
        head.setTextureOffset(0, 10).addBox(5.0F, -11.0F, 11.0F, 2.0F, 4.0F, 2.0F, 0.0F, false);
        head.setTextureOffset(48, 0).addBox(5.0F, -9.0F, 13.0F, 2.0F, 2.0F, 2.0F, 0.0F, false);
        head.setTextureOffset(0, 0).addBox(5.0F, -8.0F, 15.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
        head.setTextureOffset(28, 24).addBox(-3.0F, -8.0F, 8.0F, 8.0F, 1.0F, 8.0F, 0.0F, false);
        head.setTextureOffset(0, 44).addBox(5.0F, -16.0F, 8.0F, 2.0F, 8.0F, 3.0F, 0.0F, false);
        head.setTextureOffset(20, 48).addBox(5.0F, -8.0F, 9.0F, 2.0F, 1.0F, 2.0F, 0.0F, false);
        head.setTextureOffset(48, 33).addBox(5.0F, -16.0F, 11.0F, 2.0F, 1.0F, 2.0F, 0.0F, false);
        head.setTextureOffset(20, 33).addBox(-5.0F, -16.0F, 8.0F, 12.0F, 0.0F, 1.0F, 0.0F, false);
        head.setTextureOffset(0, 2).addBox(-4.0F, -8.0F, 15.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
        head.setTextureOffset(46, 36).addBox(-5.0F, -9.0F, 13.0F, 2.0F, 2.0F, 2.0F, 0.0F, false);
        head.setTextureOffset(8, 10).addBox(-5.0F, -11.0F, 11.0F, 2.0F, 4.0F, 2.0F, 0.0F, false);
        head.setTextureOffset(10, 44).addBox(-5.0F, -16.0F, 8.0F, 2.0F, 8.0F, 3.0F, 0.0F, false);
        head.setTextureOffset(34, 50).addBox(-5.0F, -16.0F, 11.0F, 2.0F, 1.0F, 2.0F, 0.0F, false);
        head.setTextureOffset(28, 48).addBox(-5.0F, -8.0F, 9.0F, 2.0F, 1.0F, 2.0F, 0.0F, false);
        head.setTextureOffset(0, 31).addBox(-3.0F, -16.0F, 9.0F, 8.0F, 8.0F, 5.0F, 0.0F, false);
        head.setTextureOffset(36, 12).addBox(-3.0F, -16.0F, 8.0F, 8.0F, 2.0F, 1.0F, 0.0F, false);

        body = new ModelRenderer(this);
        body.setRotationPoint(0.0F, 24.0F, 0.0F);
        body.setTextureOffset(0, 27).addBox(0.0F, -10.0F, -10.0F, 2.0F, 1.0F, 1.0F, 0.0F, false);
        body.setTextureOffset(0, 24).addBox(0.0F, -11.0F, -9.0F, 2.0F, 2.0F, 1.0F, 0.0F, false);
        body.setTextureOffset(0, 0).addBox(-4.0F, -14.0F, -8.0F, 10.0F, 8.0F, 16.0F, 0.0F, false);
    }
    @Override
    public void setRotationAngles(T entityIn, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
        this.head.rotateAngleX = headPitch * ((float)Math.PI / 180F);
        this.head.rotateAngleY = netHeadYaw * ((float)Math.PI / 180F);
        this.body.rotateAngleX = ((float)Math.PI / 2F);
        this.back_legs.rotateAngleX = MathHelper.cos(limbSwing * 0.6662F) * 1.4F * limbSwingAmount;
        this.front_legs.rotateAngleX = MathHelper.cos(limbSwing * 0.6662F + (float)Math.PI) * 1.4F * limbSwingAmount;
    }

    public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
        modelRenderer.rotateAngleX = x;
        modelRenderer.rotateAngleY = y;
        modelRenderer.rotateAngleZ = z;
    }

    @Override
    public void render(MatrixStack matrixStack, IVertexBuilder buffer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha) {
        head.render(matrixStack, buffer, packedLight, packedOverlay);
        body.render(matrixStack, buffer, packedLight, packedOverlay);
        front_legs.render(matrixStack, buffer, packedLight, packedOverlay);
        back_legs.render(matrixStack, buffer, packedLight, packedOverlay);
    }
}