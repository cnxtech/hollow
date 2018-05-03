package com.netflix.vms.transformer.hollowinput;

import com.netflix.hollow.api.objects.HollowObject;
import com.netflix.hollow.core.schema.HollowObjectSchema;

import com.netflix.hollow.tools.stringifier.HollowRecordStringifier;

@SuppressWarnings("all")
public class DownloadableIdHollow extends HollowObject {

    public DownloadableIdHollow(DownloadableIdDelegate delegate, int ordinal) {
        super(delegate, ordinal);
    }

    public long _getValue() {
        return delegate().getValue(ordinal);
    }

    public Long _getValueBoxed() {
        return delegate().getValueBoxed(ordinal);
    }

    public VMSHollowInputAPI api() {
        return typeApi().getAPI();
    }

    public DownloadableIdTypeAPI typeApi() {
        return delegate().getTypeAPI();
    }

    protected DownloadableIdDelegate delegate() {
        return (DownloadableIdDelegate)delegate;
    }

}