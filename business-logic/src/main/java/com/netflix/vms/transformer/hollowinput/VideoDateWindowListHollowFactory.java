package com.netflix.vms.transformer.hollowinput;

import com.netflix.hollow.api.objects.provider.HollowFactory;
import com.netflix.hollow.core.read.dataaccess.HollowTypeDataAccess;
import com.netflix.hollow.api.custom.HollowTypeAPI;
import com.netflix.hollow.api.objects.delegate.HollowListCachedDelegate;

@SuppressWarnings("all")
public class VideoDateWindowListHollowFactory<T extends VideoDateWindowListHollow> extends HollowFactory<T> {

    @Override
    public T newHollowObject(HollowTypeDataAccess dataAccess, HollowTypeAPI typeAPI, int ordinal) {
        return (T)new VideoDateWindowListHollow(((VideoDateWindowListTypeAPI)typeAPI).getDelegateLookupImpl(), ordinal);
    }

    @Override
    public T newCachedHollowObject(HollowTypeDataAccess dataAccess, HollowTypeAPI typeAPI, int ordinal) {
        return (T)new VideoDateWindowListHollow(new HollowListCachedDelegate((VideoDateWindowListTypeAPI)typeAPI, ordinal), ordinal);
    }

}