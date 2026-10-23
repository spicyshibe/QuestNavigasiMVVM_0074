package com.example.praktikumact5.view

import androidx.compose.runtime.Composable
import androidx.compose.ui.res.stringResource
import com.example.praktikumact5.R

@OptIn(ExperimentalStdlibApi::class)
@Composable
fun TampilData (
    onBackBtnClick: ()->Unit
){
    val items = listOf(
        Pair(stringResource(id = R.string.Nama_Lengkap),"Contoh Nama"),
        Pair(stringResource(id = R.string.jenis_kelamin),"Lainnya"),
        Pair(stringResource(id = R.string.Alamat),"Yogyakarta"),
    )

}