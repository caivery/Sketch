/*
 * Copyright (C) 2013 Peng fei Pan <sky@xiaopan.me>
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package me.xiaopan.sketch.download;

import me.xiaopan.sketch.DownloadRequest;
import me.xiaopan.sketch.DownloadResult;
import me.xiaopan.sketch.Identifier;

/**
 * 下载器
 */
public interface ImageDownloader extends Identifier {
    int BUFFER_SIZE = 8 * 1024;   // 默认缓存池大小
    int DEFAULT_READ_TIMEOUT = 20 * 1000;   // 默认读取超时时间
    int DEFAULT_CONNECT_TIMEOUT = 20 * 1000;    // 默认连接超时时间
    int DEFAULT_MAX_RETRY_COUNT = 1;    // 默认最大重试次数

    /**
     * 下载
     */
    DownloadResult download(DownloadRequest downloadRequest);

    /**
     * 设置最大重试次数（默认1）
     */
    void setMaxRetryCount(int maxRetryCount);

    /**
     * 设置连接超时时间（默认20 * 1000）
     */
    void setConnectTimeout(int connectTimeout);
}