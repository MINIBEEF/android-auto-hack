package com.nuvent.shareat.api.member;

import android.content.Context;
import com.google.gson.Gson;
import com.google.gson.JsonElement;
import com.google.gson.JsonParser;
import com.nuvent.shareat.api.ApiUrl;
import com.nuvent.shareat.api.Request;
import com.nuvent.shareat.model.BaseResultModel;
import io.fabric.sdk.android.services.network.HttpRequest;
import org.apache.http.Header;

public class AvatarUploadApi extends Request {
    public AvatarUploadApi(Context context) {
        super(context);
        this.serviceUrl = ApiUrl.UPLOAD_AVATAR_IMAGE;
        this.method = HttpRequest.METHOD_POST;
    }

    /* access modifiers changed from: protected */
    public Object parseContent(Header[] headers, String responseText) throws Exception {
        return (BaseResultModel) new Gson().fromJson((JsonElement) new JsonParser().parse(responseText).getAsJsonObject(), BaseResultModel.class);
    }

    /* access modifiers changed from: protected */
    public Object parseErrorCode(String responseText) throws Exception {
        return null;
    }
}