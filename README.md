Include the library as local library project:

maven {url 'https://jitpack.io'}



Include the library as local library project:

implementation 'com.github.smartandroidcourse:FadeOut:1.0'



Add view to your layout file:

<!-- ... -->

    <smartandroidcourses.Fadeout
        android:id="@+id/fade_out_particle"
        android:layout_width="wrap_content"
        android:layout_centerInParent="true"
        android:layout_height="wrap_content">
        <TextView
            android:layout_width="wrap_content"
            android:layout_height="wrap_content"
            android:text="SMART ANDROID COURSE"
            android:textSize="20sp"
            android:fontFamily="sans-serif-black"/>
    </smartandroidcourses.Fadeout>

<!-- ... -->



Add component handler into your activity or fragment (Java):

//START ANIMATION
fade_out_particle.startAnimation();

//RESET ANIMATION
fade_out_particle.reset();



Add component handler into your activity or fragment (Kotlin):

//START ANIMATION
fade_out_particle.startAnimation()

//RESET ANIMATION
fade_out_particle.reset()



