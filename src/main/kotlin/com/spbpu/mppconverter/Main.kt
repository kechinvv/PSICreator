package com.spbpu.mppconverter

import com.spbpu.mppconverter.kootstrap.PSICreator
import com.spbpu.mppconverter.util.debugPrint
import org.jetbrains.kotlin.psi.KtFile

fun main(arg: String): KtFile {
    val psi = PSICreator().getPSIForFile(arg)
    psi.debugPrint()
    return psi
}