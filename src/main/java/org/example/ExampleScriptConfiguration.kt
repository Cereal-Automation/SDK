package org.example

import com.cereal.api.script.configuration.ScriptConfiguration
import com.cereal.api.script.configuration.ScriptConfigurationGroup
import com.cereal.api.script.configuration.ScriptConfigurationItem

@ScriptConfigurationGroup("examplescript")
interface ExampleScriptConfiguration: ScriptConfiguration {

    @ScriptConfigurationItem(
        keyName = "discord_webhook",
        name = "Discord webhook",
        description = "Discord webhook url",
        position = 0
    )
    @JvmDefault
    fun discordWebhookUrl(): String {
        return "DiscordURL"
    }

}