package com.arjunalabs.android.conclave.entity

/**
 * Created by bobbyprabowo on 04/03/18.
 */

/*
{
            "id": 4,
            "first_name": "Eve",
            "last_name": "Holt",
            "avatar": "https://s3.amazonaws.com/uifaces/faces/twitter/marcoramires/128.jpg"
        }
 */

data class User(val id: Int, val first_name: String, val last_name: String, val avatar: String)