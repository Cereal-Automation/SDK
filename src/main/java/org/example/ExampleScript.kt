package org.example

import com.cereal.api.script.Script
import com.cereal.api.script.ScriptManifest
import com.cereal.api.script.ScriptStatus

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

    override suspend fun onFinish() {

    }

    override suspend fun onStart(): Boolean {
        return true
    }

    override suspend fun loop(): Int {

        return 100
    }
}