/*
 * Copyright (C) 2019 Twilio, Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.twilio.video.app.data

import com.twilio.video.app.BuildConfig
import com.twilio.video.app.data.api.TokenService
import com.twilio.video.app.data.api.model.RoomProperties

class CommunityTokenService : TokenService {
    /*
     * TODO: Topology is ignored so the Room will be the default type setup for the account. Use
     * REST API to create a Room with topology and create token with Room SID.
     */
    override suspend fun getToken(identity: String, roomProperties: RoomProperties): String {
        return BuildConfig.TWILIO_ACCESS_TOKEN
    }
}