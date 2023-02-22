package com.example.testacc

import android.accessibilityservice.AccessibilityService
import android.accessibilityservice.AccessibilityServiceInfo
import android.util.Log
import android.view.accessibility.AccessibilityEvent
import android.view.accessibility.AccessibilityNodeInfo

class AccServer : AccessibilityService() {

    override fun onServiceConnected() {
        super.onServiceConnected()
    }

    override fun onAccessibilityEvent(event: AccessibilityEvent?) {
        // 获取事件类型
        val eventType: Int = event?.eventType ?: return
        when (eventType) {
            AccessibilityEvent.TYPE_WINDOW_STATE_CHANGED -> {
                // 当窗口状态发生变化时获取根节点
                val rootNode: AccessibilityNodeInfo? = rootInActiveWindow
                if (rootNode != null) {
                    // 处理根节点
                }
            }
            // 处理其他可访问性事件
        }
    }

    override fun onInterrupt() {
        // 当服务被打断时执行
    }

    override fun onDestroy() {
        // 销毁服务时执行
        super.onDestroy()
    }
}
