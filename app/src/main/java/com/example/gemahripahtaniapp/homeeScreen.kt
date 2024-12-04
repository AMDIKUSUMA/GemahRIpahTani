package com.example.gemahripahtaniapp

//@Composable
//fun HomeScreen(
//    navController: NavHostController,
//    homee: List<hidroponik> = DummyData.Home
//) {
//    Box(
//        modifier = Modifier.fillMaxSize()
//    ) {
//        Column(
//            modifier = Modifier.padding(start = 20.dp)
//        ) {
//            Text(
//                text = "Hidroponik",
//                fontSize = 20.sp
//            )
//            Spacer(
//                modifier = Modifier.height(20.dp)
//            )
//            LazyColumn(
//                verticalArrangement = Arrangement.spacedBy(8.dp)
//            ) {
//                items(homee, key = { it.id }) { hidroponikItem ->
//                    HomeItem(hidroponik = hidroponikItem) { hidroponikId ->
//                        navController.navigate(Screen.Detail.route + "/$hidroponikId")
//                    }
//                }
//            }
//        }
//    }
//}
