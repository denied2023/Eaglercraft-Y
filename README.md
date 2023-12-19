# Project-EaglercraftY-1.9-version
(PLEASE DONT SUE ME Mojang/MICROSOFT!)
AND PLEASE DONT PUT THIS (DMCA)

### Note: This IS EXPERMIMENTAL BUILD!!!!
### MOJANG PLSSS DONT BAN ME AND DMCA ME PLSSSS!!!!!!!@#>!@#?!@#!@#?@!?#

(i need to code Opengl to make it possible and try to port to Teavm to 1.9)
![xojang-480p](https://github.com/denied2023/Eaglercraft-Y/assets/129306306/d58c2db7-1657-4913-8165-a821578743ea)

# Eaglercraft 1.5.2 - Service Pack 1

### Released: October 27th, 2023 - "23w43a"
### 

![eaglercraft](https://g.deev.is/eaglercraft/cover.png)
:-:
Eaglercraft is real Minecraft 1.5.2 that you can play in any regular web browser. That includes school chromebooks, it works on all chromebooks. It supports both singleplayer and multiplayer.



# Table Of Contents:
| [Singleplayer](#Singleplayer)                                 | [Multiplayer](#Multiplayer)                                                     | [Others](#Others)                                     |
|---------------------------------------------------------------|---------------------------------------------------------------------------------|-------------------------------------------------------|
| [Importing and Exporting Worlds](#Importing-and-Exporting-Worlds) | [Public clients and servers](#Public-clients-and-servers)                           | [Plugin Development](#Plugin-Development)             |
| [LAN Worlds](#LAN-Worlds)                                     | [Creating a Server - Bukkit](#Creating-a-server---Bukkit)                       | [Compiling](#Compiling)                               |
| [Public LAN Relays](#Public-LAN-Relays)                       | [Creating a Server - EaglercraftBungee](#Creating-a-server---EaglercraftBungee) | [Creating a resource pack](#Creating-a-resource-pack) |
| [Creating a LAN Relay](#Creating-a-LAN-Relay)                 | [Creating a Client](#Creating-a-Client)                                         | [Contributing](#Contributing)                         |
|                                                               | [EaglercraftBungee Configuration](#EaglercraftBungee-Configuration)             |                                                       |
|                                                               | [Creating a Reverse Proxy - NGINX](#Creating-a-Reverse-Proxy---NGINX)           |                                                       |
|                                                               | [NGINX Configuration](#NGINX-Configuration)                                     |                                                       |

# Singleplayer

Simply press the 'Singleplayer' button on the main menu and you can create a regular vanilla minecraft and play it any time.

## Importing and Exporting Worlds
The worlds are stored in your browser's local storage, **you can export them as EPK files and import them again on all other Eaglercraft sites that also support singleplayer.** You can even copy an exported world to an entirely different computer, or send it to a friend, and import it and continue playing with all your progress saved.

## LAN Worlds

### Eaglercraft fully supports LAN worlds, you can share your world with any player and they can connect directly to it as if you are running a server in your browser.

**LAN worlds will work between any two devices connected to the internet, you are not limited to only players connected to your Wi-Fi network**

To open your world to LAN, go to the pause menu and click 'Open to LAN'. You can configure the gamemode and cheats and if you would like to hide your LAN world. **When you do not hide your LAN world, it will appear on the Multiplayer screen from the main menu to anybody else also on your Wi-Fi network.** Set the world hidden if you are at school or something and don't want everyone else in your class to join as well and start griefing.

When you open the world to LAN it will give you a 'join code'. Simply share the code with your friends and they can visit the Multiplayer screen from the main menu and click 'Direct Connect' and enter the code and they will be able to join your world.

Make sure they add the relay server your game opens the LAN world on to their "Network Settings" menu accessable from the Multiplayer screen. You simply must send them the URL indicated in the pause menu once the world is opened and they can use the "Add Relay" option to add the URL to their list.

### THIS IS A REQUIRED STEP FOR A PERSON TO JOIN YOUR WORLD, IF THEY DO NOT HAVE THE RELAY YOUR WORLD IS HOSTED ON ADDED TO THEIR "Network Settings" THE GAME WILL BE UNABLE TO LOCATE THE WORLD

## Public LAN Relays

### Here are some public relay servers you can use:

 - `wss://relay.deev.is/`
 - `wss://relay.lax1dude.net/`
 - `wss://relay.shhnowisnottheti.me/`

## Creating a LAN Relay

### Simply download [stable-download/sp-relay.jar](https://github.com/lax1dude/eaglercraft/blob/main/stable-download/sp-relay.jar) and run `java -jar sp-relay.jar`

**Run `java -jar sp-relay.jar --debug` to view debug info like all the IPs of incoming connections, as it is not shown by default because logging all that info will reduce performance when the relay is being pinged many times a second depending on it's popularity.**

Edit the `relayConfig.ini` file generated on first launch to change the port and configure ratelimiting and such, and `relays.txt` to change the list of STUN and TURN relays reported to clients connecting to the relay, which are required to correctly establish a P2P LAN world connection in browsers

**The `origin-whitelist` config variable is a semicolon (`;`) seperated list of domains used to restrict what sites are to be allowed to use your relay. When left blank it allows all sites. Add `offline` to allow offline download clients to use your relay as well, and `null` to allow connections that do not specify an `Origin:` header. Use `*` as a wildcard, for example: `*.deev.is` allows all domains ending with "deev.is" to use the relay.**

# Multiplayer
Multiplayer functions like vanilla Minecraft, allowing you to join normal Minecraft servers like a normal client.

## Public clients and servers

### There are multiple official clients hosted by lax1dude, here is a small list:
- Main: [https://g.deev.is/](https://g.deev.is/ "https://g.deev.is/")
- [https://eaglercraft.net/](https://eaglercraft.net/ "https://eaglercraft.net/")  
- [https://eaglercraft.org/](https://eaglercraft.org/ "https://eaglercraft.org/")  
- [https://eaglercraft.me/](https://eaglercraft.me/ "https://eaglercraft.me/")  
- [https://g.lax1dude.net/eaglercraft/](https://g.lax1dude.net/eaglercraft/ "https://g.lax1dude.net/eaglercraft/")  
### There are also multiple community hosted servers, the best way to discover those is to use the [official clients](https://g.deev.is/eaglercraft/)

## ATTENTION MOJANG/MICROSOFT EMPLOYEE ASSIGNED TO STALK ME:

### THIS REPOSITORY DOES NOT CONTAIN YOUR INTELLECTUAL PROPERTY

### FILING A FALSE DMCA IS ILLEGAL AND IMMORAL

### This repository contains:

 - **Utilities to decompile Minecraft 1.9 and apply patch files to it**
 - **Source code to provide the LWJGL keyboard, mouse, and OpenGL APIs in a browser**
 - **Source code for an OpenGL 1.3 emulator built on top of WebGL 2.0**
 - **Patch files to mod the Minecraft 1.9 source code to make it browser compatible**
 - **Browser-modified portions of Minecraft 1.9's open-source dependencies**
 - **Plugins for Minecraft servers to allow the eagler client to connect to them**

### This repository does NOT contain:

 - **Any portion of the decompiled Minecraft 1.9 source code or resources**
 - **Any portion of Mod Coder Pack and it's config files**
 - **Data that can be used alone to reconstruct portions of the game's source code**
 - **Code configured by default to allow users to play without owning a copy of Minecraft**
