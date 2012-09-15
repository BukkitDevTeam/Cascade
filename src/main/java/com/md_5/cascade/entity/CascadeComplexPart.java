package com.md_5.cascade.entity;

import org.bukkit.entity.ComplexEntityPart;
import org.bukkit.entity.ComplexLivingEntity;

public class CascadeComplexPart extends CascadeEntity implements ComplexEntityPart {

    @Override
    public ComplexLivingEntity getParent() {
        throw new UnsupportedOperationException("Not supported yet.");
    }
}
