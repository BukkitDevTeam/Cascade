package com.md_5.cascade.entity;

import java.util.Set;
import org.bukkit.entity.ComplexEntityPart;
import org.bukkit.entity.ComplexLivingEntity;

public class CascadeComplexLivingEntity extends CascadeLivingEntity implements ComplexLivingEntity {

    @Override
    public Set<ComplexEntityPart> getParts() {
        throw new UnsupportedOperationException("Not supported yet.");
    }
}
