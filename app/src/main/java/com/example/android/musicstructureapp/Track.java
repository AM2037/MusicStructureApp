package com.example.android.musicstructureapp;

/*
+ * Copyright (C) 2016 The Android Open Source Project
+ *
+ * Licensed under the Apache License, Version 2.0 (the "License");
+ * you may not use this file except in compliance with the License.
+ * You may obtain a copy of the License at
+ *
+ *      http://www.apache.org/licenses/LICENSE-2.0
+ *
+ * Unless required by applicable law or agreed to in writing, software
+ * distributed under the License is distributed on an "AS IS" BASIS,
+ * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
+ * See the License for the specific language governing permissions and
+ * limitations under the License.
+ */


/**
 + * {@link Track} represents a collection of songs for different occasions.
 + * It contains an artist & song name for each track.
 + */
public class Track {

    //Artist Name
    private String mArtistName;

    //Song Name
    private String mSongName;



    /**
     * Create a new Track object
     * @param artistName is the name of the artist(s), producer(s), or band
     *
     * @param songName is the name of the track
     */

    public Track(String artistName, String songName) {
        mArtistName = artistName;
        mSongName = songName;
    }

    /**
     * Get the Artist and Song names
     */
    public String getArtistName() {
        return mArtistName;
    }

    public String getSongName() {
        return mSongName;
    }

}