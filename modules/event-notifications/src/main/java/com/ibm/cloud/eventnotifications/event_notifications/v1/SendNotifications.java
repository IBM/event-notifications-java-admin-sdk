/*
 * (C) Copyright IBM Corp. 2022.
 *
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with
 * the License. You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on
 * an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the
 * specific language governing permissions and limitations under the License.
 */

/*
 * IBM OpenAPI SDK Code Generator Version: 3.46.1-a5569134-20220316-164819
 */

package com.ibm.cloud.eventnotifications.event_notifications.v1;

import com.google.gson.JsonObject;
import com.ibm.cloud.event_notifications.common.SdkCommon;
import com.ibm.cloud.eventnotifications.event_notifications.v1.model.NotificationResponse;
import com.ibm.cloud.eventnotifications.event_notifications.v1.model.SendNotificationsOptions;
import com.ibm.cloud.sdk.core.http.RequestBuilder;
import com.ibm.cloud.sdk.core.http.ResponseConverter;
import com.ibm.cloud.sdk.core.http.ServiceCall;
import com.ibm.cloud.sdk.core.security.Authenticator;
import com.ibm.cloud.sdk.core.service.BaseService;
import com.ibm.cloud.sdk.core.util.ResponseConverterUtils;

import java.util.HashMap;
import java.util.Map;

public class SendNotifications extends BaseService {

    private EventNotifications enObject;
    /**
     * Constructs an instance of the `SendNotifications` instance.
     * The specified service name and authenticator in the EventNotifications client are used to configure this instance.
     *
     * @param enObject the EventNotifications instance to be configured for this client
     */
    public SendNotifications(EventNotifications enObject) {
        super(enObject.getName(), enObject.getAuthenticator());
        this.enObject = enObject;
    }

    /**
     * Send a notification.
     *
     * Send a notification.
     *
     * @param sendNotificationsOptions the {@link SendNotificationsOptions} containing the options for the call
     * @return a {@link ServiceCall} with a result of type {@link NotificationResponse}
     */
    public ServiceCall<NotificationResponse> sendNotifications(SendNotificationsOptions sendNotificationsOptions) {

        com.ibm.cloud.sdk.core.util.Validator.notNull(sendNotificationsOptions,
                "sendNotificationsOptions cannot be null");
        Map<String, String> pathParamsMap = new HashMap<String, String>();
        pathParamsMap.put("instance_id", sendNotificationsOptions.instanceId());
        RequestBuilder builder = RequestBuilder.post(RequestBuilder.resolveRequestUrl(this.enObject.getServiceUrl(), "/v1/instances/{instance_id}/notifications", pathParamsMap));
        Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("event_notifications", "v1", "sendNotifications");
        for (Map.Entry<String, String> header : sdkHeaders.entrySet()) {
            builder.header(header.getKey(), header.getValue());
        }
        builder.header("Accept", "application/json");
        final JsonObject contentJson = new JsonObject();
        contentJson.addProperty("ibmenseverity", sendNotificationsOptions.ibmenseverity());
        contentJson.addProperty("ibmensourceid", sendNotificationsOptions.ibmensourceid());
        contentJson.addProperty("subject", sendNotificationsOptions.subject());
        contentJson.addProperty("id", sendNotificationsOptions.id());
        contentJson.addProperty("source", sendNotificationsOptions.source());
        contentJson.addProperty("type", sendNotificationsOptions.type());
        contentJson.add("time", com.ibm.cloud.sdk.core.util.GsonSingleton.getGson().toJsonTree(sendNotificationsOptions.time()));
        if (sendNotificationsOptions.data() != null) {
            contentJson.add("data", com.ibm.cloud.sdk.core.util.GsonSingleton.getGson().toJsonTree(sendNotificationsOptions.data()));
        }
        if (sendNotificationsOptions.ibmenfcmbody() != null) {
            contentJson.addProperty("ibmenfcmbody", sendNotificationsOptions.ibmenfcmbody().toString());
            // contentJson.add("ibmenfcmbody", com.ibm.cloud.sdk.core.util.GsonSingleton.getGson().toJsonTree(sendNotificationsOptions.ibmenfcmbody()));
        }
        if (sendNotificationsOptions.ibmenapnsbody() != null) {
            contentJson.addProperty("ibmenapnsbody", sendNotificationsOptions.ibmenapnsbody().toString());
            //  contentJson.add("ibmenapnsbody", com.ibm.cloud.sdk.core.util.GsonSingleton.getGson().toJsonTree(sendNotificationsOptions.ibmenapnsbody()));
        }
        if (sendNotificationsOptions.ibmenpushto() != null) {
            contentJson.addProperty("ibmenpushto", sendNotificationsOptions.ibmenpushto().toString());
//      contentJson.add("ibmenpushto", com.ibm.cloud.sdk.core.util.GsonSingleton.getGson().toJsonTree(sendNotificationsOptions.ibmenpushto()));
        }
        if (sendNotificationsOptions.ibmenapnsheaders() != null) {
            contentJson.addProperty("ibmenapnsheaders", com.ibm.cloud.sdk.core.util.GsonSingleton.getGson().toJson(sendNotificationsOptions.ibmenapnsheaders()));
            //contentJson.add("ibmenapnsheaders", com.ibm.cloud.sdk.core.util.GsonSingleton.getGson().toJsonTree(sendNotificationsOptions.ibmenapnsheaders()));
        }
        if (sendNotificationsOptions.datacontenttype() != null) {
            contentJson.addProperty("datacontenttype", sendNotificationsOptions.datacontenttype());
        } else {
            contentJson.addProperty("datacontenttype", "application/json");
        }
        if (sendNotificationsOptions.specversion() != null) {
            contentJson.addProperty("specversion", sendNotificationsOptions.specversion());
        } else {
            contentJson.addProperty("specversion", "1.0");
        }
        builder.bodyJson(contentJson);
        ResponseConverter<NotificationResponse> responseConverter =
                ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<NotificationResponse>() { }.getType());
        return createServiceCall(builder.build(), responseConverter);
    }
}
