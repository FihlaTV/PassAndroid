package org.ligi.passandroid.model;

import android.graphics.Bitmap;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;

import com.google.common.base.Optional;

import org.joda.time.DateTime;

import java.io.Serializable;
import java.util.List;

public interface Pass extends Serializable {

    static final String[] TYPES = new String[]{"generic", "coupon", "eventTicket", "boardingPass", "storeCard"};

    String getDescription();

    @Nullable
    String getType();

    @NonNull
    String getTypeNotNull();

    PassFieldList getPrimaryFields();

    PassFieldList getSecondaryFields();

    PassFieldList getBackFields();

    PassFieldList getAuxiliaryFields();

    PassFieldList getHeaderFields();

    List<PassLocation> getLocations();

    boolean isValid();

    Optional<Bitmap> getIconBitmap();

    Optional<Bitmap> getThumbnailImage();

    Optional<Bitmap> getLogoBitmap();

    int getBackGroundColor();

    int getForegroundColor();

    Optional<DateTime> getRelevantDate();

    Optional<DateTime> getExpirationDate();

    String getPath();

    String getId();

    @Nullable
    String getOrganisation();

    Optional<String> getSource();

    @Nullable
    BarCode getBarCode();

    Optional<Bitmap> getStripImage();

    Optional<String> getWebServiceURL();

    Optional<String> getAuthToken();

    Optional<String> getSerial();

    Optional<String> getPassIdent();

    String getApp();
}
