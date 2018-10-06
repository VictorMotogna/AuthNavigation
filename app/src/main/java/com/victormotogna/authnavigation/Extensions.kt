package com.victormotogna.authnavigation

import android.animation.ObjectAnimator
import android.view.View

fun View.shuffleAnimate() {
    ObjectAnimator
            .ofFloat(this, "translationX", 0f, 25f, -25f, 25f, -25f, 15f, -15f, 6f, -6f, 0f)
            .setDuration(200)
            .start()
}