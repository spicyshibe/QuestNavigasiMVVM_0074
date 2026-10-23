package com.example.praktikumact5.view

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.dimensionResource
import androidx.compose.ui.res.stringResource
import com.example.praktikumact5.R

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun TampilData (
    onBackBtnClick: ()->Unit
){
    val items = listOf(
        Pair(stringResource(id = R.string.Nama_Lengkap),"Contoh Nama"),
        Pair(stringResource(id = R.string.jenis_kelamin),"Lainnya"),
        Pair(stringResource(id = R.string.Alamat),"Yogyakarta"),
    )
    Scaffold(modifier = Modifier,
        {
            TopAppBar(
                title = {Text(text = stringResource(id=R.string.tampil), color = Color.White)},
                colors = TopAppBarDefaults.mediumTopAppBarColors(colorResource(id =R.color.teal_700))
            )
        }) { isiRuang ->
        Column(
            modifier = Modifier.padding(isiRuang),
            verticalArrangement = Arrangement.SpaceBetween)
        {
            Column(modifier = Modifier.padding(dimensionResource(id = R.dimen.padding_medium)),
                verticalArrangement = Arrangement.spacedBy(dimensionResource(id=R.dimen.padding_small)))
            {

            }
        }
    }
}