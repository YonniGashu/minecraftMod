package com.Vym.firstMod.client.render;

import com.Vym.firstMod.StartingMod;
import com.Vym.firstMod.client.model.IronHogModel;
import com.Vym.firstMod.entities.IronHogEntity;
import net.minecraft.client.renderer.entity.EntityRendererManager;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.util.ResourceLocation;

public class IronHogRenderer extends MobRenderer<IronHogEntity, IronHogModel<IronHogEntity>> {

    protected static final ResourceLocation TEXTURE = new ResourceLocation(StartingMod.MOD_ID, "textures/entity/iron_hog_texture.png");

    public IronHogRenderer(EntityRendererManager renderManagerIn) {
        super(renderManagerIn, new IronHogModel<>(), 0.7F);
    }

    @Override
    public ResourceLocation getEntityTexture(IronHogEntity entity) {
        return TEXTURE;
    }
}
