# Button-Morphing-Animation

🌟 Enhance your user interfaces with dynamic morphing button animations in just a few lines of code.

<div align="center">
<center> <img src = "https://github.com/khan-mujeeb/Button-Morphing-Animation/assets/89351750/c3181736-0f79-44ec-85f0-f2cc4537f818" /> </center>
</div>

## Including in your project

**Step 1.** Add the JitPack repository to your root build.gradle at the end of repositories
```kotlin
allprojects {
		repositories {
			maven { url 'https://jitpack.io' }
		}
	}
```

**Step 2.** Add the dependency below to your module's build.gradle file
```kotlin
dependencies {
	        implementation 'com.github.khan-mujeeb:Button-Morphing-Animation:Tag'
	}
```

##  Usage
**Step 1.** Add the following code to your xml layout
```xml
<com.example.button_morphing.customview.MorphButton
        android:layout_width="180dp"
        android:layout_height="50dp"
        android:id="@+id/btn2" />
```

**Step 2.** Add this code to your respective kt file
```kotlin
binding.btn2.text = "Let's get Started"

        binding.btn2.setOnClickListener {
            binding.btn2. setUIState(MorphButton.UIState.Loading)
        }
```
