package com.google.firebase.udacity.greenthumb.data;

import android.content.Context;
import android.os.Bundle;

import com.google.firebase.analytics.FirebaseAnalytics;

/**
 * Created by Laci on 22/05/2018.
 */

public class Analytics {
    public static void logEventAddToCart(Context context, Plant plant, double quantity) {
        Bundle bundle = new Bundle();
        bundle.putInt(FirebaseAnalytics.Param.ITEM_ID, plant.id);
        bundle.putString(FirebaseAnalytics.Param.ITEM_NAME, plant.name);
        bundle.putString(FirebaseAnalytics.Param.ITEM_CATEGORY, "plants");
        bundle.putDouble(FirebaseAnalytics.Param.QUANTITY, quantity);
        bundle.putDouble(FirebaseAnalytics.Param.PRICE, plant.price);

        FirebaseAnalytics.getInstance(context).logEvent(
                FirebaseAnalytics.Event.ADD_TO_CART, bundle
        );
        FirebaseAnalytics.getInstance(context).logEvent(
                FirebaseAnalytics.Event.VIEW_ITEM, bundle
        );

        FirebaseAnalytics.getInstance(context).logEvent(
                FirebaseAnalytics.Event.VIEW_ITEM_LIST, bundle
        );

        FirebaseAnalytics.getInstance(context).logEvent(
                FirebaseAnalytics.Event.SET_CHECKOUT_OPTION, bundle
        );

        FirebaseAnalytics.getInstance(context).logEvent(
                FirebaseAnalytics.Event.ADD_TO_WISHLIST, bundle
        );
    }
}
