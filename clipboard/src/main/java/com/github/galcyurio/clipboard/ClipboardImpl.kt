package com.github.galcyurio.clipboard

import android.util.Log
import javax.inject.Inject

internal class ClipboardImpl @Inject constructor() : Clipboard {
    override fun copyPlainText() {
        Log.i("TEST", "copyPlainText()")
    }
}
