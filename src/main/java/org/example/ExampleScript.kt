package org.example

import com.cereal.api.script.Script
import com.cereal.api.script.ScriptManifest
import com.cereal.api.script.ScriptStatus
import com.cereal.api.script.component.ComponentProvider

@ScriptManifest(
    name = "Example script",
    version = 1.0,
    description = "My first script",
    authors = ["Dewinster"],
    keyword = ["first", "example", "script"],
    website = ""
)
class ExampleScript: Script {

    override var status: ScriptStatus = ScriptStatus.RUNNING

    override suspend fun onStart(provider: ComponentProvider): Boolean {
        return true
    }

    override suspend fun loop(provider: ComponentProvider): Int {
        provider.logger().debug("TEST")
        return 1000
    }

    override suspend fun onFinish(provider: ComponentProvider) {

    }


}