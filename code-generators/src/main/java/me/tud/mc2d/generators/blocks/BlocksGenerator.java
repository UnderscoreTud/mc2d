package me.tud.mc2d.generators.blocks;

import com.palantir.javapoet.ParameterizedTypeName;
import com.palantir.javapoet.WildcardTypeName;
import me.tud.mc2d.generators.BuiltInRegistry;
import me.tud.mc2d.generators.GeneratedType;
import me.tud.mc2d.generators.blocks.blockdata.BlockData;
import me.tud.mc2d.generators.blocks.blockdata.property.Property;
import me.tud.mc2d.generators.util.Imports;
import org.apache.commons.lang3.ArrayUtils;

import java.io.IOException;
import java.util.List;

public class BlocksGenerator extends BuiltInRegistry<Blocks.Entry> {

    protected BlocksGenerator() {
        super("block", "blocks.json", Imports.BLOCK, ParameterizedTypeName.get(Imports.BLOCK, WildcardTypeName.subtypeOf(Object.class)));
    }

    static void main(String[] args) throws Exception {
        new BlocksGenerator().run(args);
    }

    @Override
    protected List<Blocks.Entry> entries(String resource) throws IOException {
        Blocks blocks = MAPPER.readValue(stream(resource), Blocks.class);
        return blocks.entries(MAPPER.readTree(stream(REGISTRIES_RESOURCE_LOCATION)));
    }

    @Override
    public GeneratedType[] generateExtra(List<Blocks.Entry> entries, String resource) {
        return ArrayUtils.addAll(Property.generateSharedProperties(), BlockData.generateBlockData());
    }

}
