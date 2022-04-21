# kmm
Development of a poc to test kmm

# Create project from zero

1) Create project in Android Studio ( Kotlin Multiplataform App ) 
2) Execute command  "sudo gem install cocoapods"  and "sudo gem install cocoapods-generate" and "sudo arch -x86_64 gem install ffi"
3) Cd in project iOS
4) Execute  arch -x86_64 pod install

# Structure

Common Kotlin includes the language, core libraries, and basic tools. Code written in common Kotlin works everywhere on all platforms.

With Kotlin Multiplatform libraries, you can reuse the multiplatform logic in common and platform-specific code. Common code can rely on a set of libraries that cover everyday tasks such as HTTP, serialization, and managing coroutines.

To interop with platforms, use platform-specific versions of Kotlin. Platform-specific versions of Kotlin (Kotlin/JVM, Kotlin/JS, Kotlin/Native) include extensions to the Kotlin language, and platform-specific libraries and tools.

Through these platforms you can access the platform native code (JVM, JS, and Native) and leverage all native capabilities. ( https://kotlinlang.org/docs/multiplatform.html#how-kotlin-multiplatform-works)

[![https://miro.medium.com/max/1400/0*0NEdJXtj9_IF2df5](https://miro.medium.com/max/1400/0*0NEdJXtj9_IF2df5 "https://miro.medium.com/max/1400/0*0NEdJXtj9_IF2df5")](https://miro.medium.com/max/1400/0*0NEdJXtj9_IF2df5 "https://miro.medium.com/max/1400/0*0NEdJXtj9_IF2df5")

# App 
## Requeriments  
* List of stocks with name, value
* Details from stock with earnings
## Architecture

## Libraries 
 [ktor](https://ktor.io/ "Ktor") :
  Add ktor_version = last version in gradle.properties;
  
  Add dependencies in build.gradle.kts:
  
    implementation("io.ktor:ktor-client-core:$ktor_version")
    implementation("io.ktor:ktor-client-cio:$ktor_version")
    implementation ("org.kodein.di:kodein-di:7.10.0")
 
 ## Framework Distribution
 iOS:  CocoaPodes dependency manager or Gradle
 Android: Gradle
 




## Questions

1) Which dependency manager to use for iOS? Gradle or cocoaPods ?



# References 
* [Libraries for kmm](https://github.com/AAkira/Kotlin-Multiplatform-Libraries "Libraries for kmm")
* [KampKit for developer KMM](https://github.com/touchlab/KaMPKit "KampKit for developer KMM")
* [KMM for beginners](https://medium.com/RafaelSermenho/kotlin-multiplatform-mobile-922b8c6abc9f "KMM")







