package org.example

import com.cereal.api.script.Script
import com.cereal.api.script.ScriptManifest
import com.cereal.api.script.component.ComponentProvider

@ScriptManifest(
    name = "Example script",
    version = 1.0,
    description = "My first script",
    authors = ["Dewinster"],
    keyword = ["first", "example", "script"],
    website = ""
)
class ExampleScript : Script<ExampleScriptConfiguration> {

    override fun getConfiguration(): Class<ExampleScriptConfiguration>? {
        return ExampleScriptConfiguration::class.java
    }

    override suspend fun onStart(configuration: ExampleScriptConfiguration?, provider: ComponentProvider): Boolean {
        return true
    }

    override suspend fun loop(configuration: ExampleScriptConfiguration?, provider: ComponentProvider): Int {
        provider.logger().debug("TEST")
        return 1000
    }

    override suspend fun onFinish(configuration: ExampleScriptConfiguration?, provider: ComponentProvider) {
    }

}