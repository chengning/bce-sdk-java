/*
 * Copyright 2016 Baidu, Inc.
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

package com.baidubce.services.vod.model;

import com.baidubce.auth.BceCredentials;
import com.baidubce.model.AbstractBceRequest;

public class CreateNotificationRequest extends AbstractBceRequest {

    /**
     * 通知名称
     **/
    private String name = null;

    /**
     * 通知消息接收地址
     **/
    private String endpoint = null;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public CreateNotificationRequest withName(String name) {
        this.name = name;
        return this;
    }

    public String getEndpoint() {
        return endpoint;
    }

    public void setEndpoint(String endpoint) {
        this.endpoint = endpoint;
    }

    public CreateNotificationRequest withEndpoint(String endpoint) {
        this.endpoint = endpoint;
        return this;
    }


    public CreateNotificationRequest withRequestCredentials(BceCredentials credentials) {
        this.setRequestCredentials(credentials);
        return this;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append("class CreateNotificationRequest {\n");
        sb.append("    name: ").append(name).append("\n");
        sb.append("    endpoint: ").append(endpoint).append("\n");
        sb.append("}\n");
        return sb.toString();
    }
}