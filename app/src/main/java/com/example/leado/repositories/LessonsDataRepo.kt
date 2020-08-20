package com.example.leado.repositories

import com.example.leado.model.LessonItemClass

object LessonsDataRepo {

    fun getfakedataAwareness(): ArrayList<LessonItemClass> {

        var LessonData: ArrayList<LessonItemClass> = ArrayList()

        LessonData.add(
            LessonItemClass(
                "What is self-awareness",
                "Lesson 1",
                "Building an integral support system,\n" +
                        "Pushes you to grow, strech more, mainly asks why things wont work, and bullet proofs ideas",
                "start"
            )
        )
        LessonData.add(
            LessonItemClass(
                "Examples self-awareness",
                "Lesson 2",
                "Building an integral support system,\n" +
                        "Pushes you to grow, strech more, mainly asks why things wont work, and bullet proofs ideas",
                "Lock"
            )
        )
        LessonData.add(
            LessonItemClass(
                "Ways to increase your self-awareness",
                "Lesson 3",
                "Building an integral support system,\n" +
                        "Pushes you to grow, strech more, mainly asks why things wont work, and bullet proofs ideas",
                "Lock"
            )
        )
        LessonData.add(
            LessonItemClass(
                "Improving your self-awareness",
                "Lesson 4",
                "Building an integral support system,\n" +
                        "Pushes you to grow, strech more, mainly asks why things wont work, and bullet proofs ideas",
                "Lock"
            )
        )
        return LessonData
    }


    fun getfakedataMind(): ArrayList<LessonItemClass> {

        var LessonData: ArrayList<LessonItemClass> = ArrayList()

        LessonData.add(
            LessonItemClass(
                "What is Mind-Mapping",
                "Lesson 1",
                "Building an integral support system,\n" +
                        "Pushes you to grow, strech more, mainly asks why things wont work, and bullet proofs ideas",
                "start"
            )
        )
        LessonData.add(
            LessonItemClass(
                "Examples Mind-mapping",
                "Lesson 2",
                "Building an integral support system,\n" +
                        "Pushes you to grow, strech more, mainly asks why things wont work, and bullet proofs ideas",
                "Lock"
            )
        )
        LessonData.add(
            LessonItemClass(
                "Ways to increase your Mind-mapping skills",
                "Lesson 3",
                "Building an integral support system,\n" +
                        "Pushes you to grow, strech more, mainly asks why things wont work, and bullet proofs ideas",
                "Lock"
            )
        )
        LessonData.add(
            LessonItemClass(
                "Improving your Mind-mapping",
                "Lesson 4",
                "Building an integral support system,\n" +
                        "Pushes you to grow, strech more, mainly asks why things wont work, and bullet proofs ideas",
                "Lock"
            )
        )
        return LessonData
    }


    fun getfakedataBranding(): ArrayList<LessonItemClass> {

        var LessonData: ArrayList<LessonItemClass> = ArrayList()

        LessonData.add(
            LessonItemClass(
                "What is personal-Branding",
                "Lesson 1",
                "Building an integral support system,\n" +
                        "Pushes you to grow, strech more, mainly asks why things wont work, and bullet proofs ideas",
                "start"
            )
        )
        LessonData.add(
            LessonItemClass(
                "Examples personal-Branding",
                "Lesson 2",
                "Building an integral support system,\n" +
                        "Pushes you to grow, strech more, mainly asks why things wont work, and bullet proofs ideas",
                "Lock"
            )
        )
        LessonData.add(
            LessonItemClass(
                "how to start your personal-Branding",
                "Lesson 3",
                "Building an integral support system,\n" +
                        "Pushes you to grow, strech more, mainly asks why things wont work, and bullet proofs ideas",
                "Lock"
            )
        )
        LessonData.add(
            LessonItemClass(
                "how to grow up",
                "Lesson 4",
                "Building an integral support system,\n" +
                        "Pushes you to grow, strech more, mainly asks why things wont work, and bullet proofs ideas",
                "Lock"
            )
        )
        return LessonData
    }

}