package com.project.greenmind.homeFragment.home_result_rv

class ResultRepository {
    fun getRepoList():List<ResultItem>{
        return listOf(
            ResultItem(
                resultDate = "2020-01-07"
            ),
            ResultItem(
                resultDate = "2020-01-10"
            ),
            ResultItem(
                resultDate = "2020-01-17"
            ),
            ResultItem(
                resultDate = "2020-01-21"
            ),
            ResultItem(
                resultDate = "2020-02-01"
            ),
            ResultItem(
                resultDate = "2020-02-05"
            ),
            ResultItem(
                resultDate = "2020-02-27"
            )
        )
    }
}