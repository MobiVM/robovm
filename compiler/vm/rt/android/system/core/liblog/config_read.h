/*
 * Copyright (C) 2016 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

#pragma once

#include <cutils/list.h>

#include "log_portability.h"

__BEGIN_DECLS

extern struct listnode __android_log_transport_read;
extern struct listnode __android_log_persist_read;

#define read_transport_for_each(transp, transports)                           \
  for ((transp) = node_to_item((transports)->next,                            \
                               struct android_log_transport_read, node);      \
       ((transp) != node_to_item((transports),                                \
                                 struct android_log_transport_read, node)) && \
       ((transp) != node_to_item((transp)->node.next,                         \
                                 struct android_log_transport_read, node));   \
       (transp) = node_to_item((transp)->node.next,                           \
                               struct android_log_transport_read, node))

#define read_transport_for_each_safe(transp, n, transports)                   \
  for ((transp) = node_to_item((transports)->next,                            \
                               struct android_log_transport_read, node),      \
      (n) = (transp)->node.next;                                              \
       ((transp) != node_to_item((transports),                                \
                                 struct android_log_transport_read, node)) && \
       ((transp) !=                                                           \
        node_to_item((n), struct android_log_transport_read, node));          \
       (transp) = node_to_item((n), struct android_log_transport_read, node), \
      (n) = (transp)->node.next)

void __android_log_config_read();
void __android_log_config_read_close();

__END_DECLS
