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
* Filter by date with earnings 
* filter earnings by data or action
* Insert/Update/Delete Stock
* Insert/Update/Delete earning


## Architecture
https://lucid.app/publicSegments/view/07776f46-3850-41c1-9cfc-7c83ead2b8a6

## Libraries 
 [ktor](https://ktor.io/ "Ktor") 
 
 [Config ktor sharedCode](https://ktor.io/docs/getting-started-ktor-client-multiplatform-mobile.html#ktor-dependencies "Ktor sharedCode")
 
 [DI]implementation ("org.kodein.di:kodein-di:7.10.0")   
 
 ## Framework Distribution
  iOS:  CocoaPodes dependency manager or Gradle
  Android: Gradle
 
Select the most suitable type of Kotlin framework distribution to Xcode:

• CocoaPods Dependency Manager: Kotlin Multiplatform module is used as a CocoaPods dependency. Requires
Ruby gem installation.

• Regular framework: Kotlin Multiplatform module is integrated via internal Gradle task and Xcode Build Steps
configuration. Doesn't require 3rd party tools.
 




## Questions

1) Which dependency manager to use for iOS? Gradle or cocoaPods ?
2) Is it possible to use coroutines on Android and iOS?
3) is it possible to perform unit tests in the infra, domain, external layer?




# References 
* [Libraries for kmm](https://github.com/AAkira/Kotlin-Multiplatform-Libraries "Libraries for kmm")
* [KampKit for developer KMM](https://github.com/touchlab/KaMPKit "KampKit for developer KMM")
* [KMM for beginners](https://medium.com/RafaelSermenho/kotlin-multiplatform-mobile-922b8c6abc9f "KMM")
* [Intro to Kotlin Multiplatform](https://www.youtube.com/watch?v=HFDqjpfoSZE "Intro to Kotlin Multiplatform")







