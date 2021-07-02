/*
 * Copyright 2021 thunderbiscuit and contributors.
 * Use of this source code is governed by the Apache 2.0 license that can be found in the ./LICENSE file.
 */

package org.summerofbitcoin.testapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import org.bitcoindevkit.bdkjni.Lib

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val awesomeButton: Button = findViewById<Button>(R.id.awesomeButton)
        val bdkLogo: ImageView = findViewById<ImageView>(R.id.bdkView)
        var pressNumber: Int = 0

        awesomeButton.setOnClickListener {
            when (pressNumber % 6) {
                0 -> bdkLogo.setImageResource(R.drawable.logo_bitcoindevkit0)
                1 -> bdkLogo.setImageResource(R.drawable.logo_bitcoindevkit1)
                2 -> bdkLogo.setImageResource(R.drawable.logo_bitcoindevkit2)
                3 -> bdkLogo.setImageResource(R.drawable.logo_bitcoindevkit3)
                4 -> bdkLogo.setImageResource(R.drawable.logo_bitcoindevkit4)
                5 -> bdkLogo.setImageResource(R.drawable.logo_bitcoindevkit)
            }
            pressNumber += 1
        }
    }
}
