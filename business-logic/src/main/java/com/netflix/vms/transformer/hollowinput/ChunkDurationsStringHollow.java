package com.netflix.vms.transformer.hollowinput;

import com.netflix.hollow.api.objects.HollowObject;
import com.netflix.hollow.core.schema.HollowObjectSchema;

import com.netflix.hollow.tools.stringifier.HollowRecordStringifier;

@SuppressWarnings("all")
public class ChunkDurationsStringHollow extends HollowObject {

    public ChunkDurationsStringHollow(ChunkDurationsStringDelegate delegate, int ordinal) {
        super(delegate, ordinal);
    }

    public String _getValue() {
        return delegate().getValue(ordinal);
    }

    public boolean _isValueEqual(String testValue) {
        return delegate().isValueEqual(ordinal, testValue);
    }

    public VMSHollowInputAPI api() {
        return typeApi().getAPI();
    }

    public ChunkDurationsStringTypeAPI typeApi() {
        return delegate().getTypeAPI();
    }

    protected ChunkDurationsStringDelegate delegate() {
        return (ChunkDurationsStringDelegate)delegate;
    }

}