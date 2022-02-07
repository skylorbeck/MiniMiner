package website.skylorbeck.miniminer.entity;

import net.minecraft.client.render.RenderLayer;
import net.minecraft.client.render.VertexConsumer;
import net.minecraft.client.render.VertexConsumerProvider;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.util.Identifier;
import software.bernie.geckolib3.model.AnimatedGeoModel;
import software.bernie.geckolib3.renderers.geo.GeoBlockRenderer;

public class MiniMinerRenderer extends GeoBlockRenderer<MiniMinerBlockEntity> {

    public MiniMinerRenderer() {
        super(new MiniMinerModel());
    }

    @Override
    public RenderLayer getRenderType(MiniMinerBlockEntity animatable, float partialTicks, MatrixStack stack,
                                     VertexConsumerProvider renderTypeBuffer, VertexConsumer vertexBuilder, int packedLightIn,
                                     Identifier textureLocation) {
        return RenderLayer.getEntityCutout(getTextureLocation(animatable));
    }
}
