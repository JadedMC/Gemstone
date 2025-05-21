/*
 * This file is part of Gemstone, licensed under the MIT License.
 *
 *  Copyright (c) JadedMC
 *  Copyright (c) contributors
 *
 *  Permission is hereby granted, free of charge, to any person obtaining a copy
 *  of this software and associated documentation files (the "Software"), to deal
 *  in the Software without restriction, including without limitation the rights
 *  to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 *  copies of the Software, and to permit persons to whom the Software is
 *  furnished to do so, subject to the following conditions:
 *
 *  The above copyright notice and this permission notice shall be included in all
 *  copies or substantial portions of the Software.
 *
 *  THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 *  IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 *  FITNESS FOR A PARTICULAR PURPOSE AND NON-INFRINGEMENT. IN NO EVENT SHALL THE
 *  AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 *  LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 *  OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
 *  SOFTWARE.
 */
package net.jadedmc.gemstone.utils;

import org.bukkit.Bukkit;

/**
 * A collection of utilities related to the version of the server.
 */
public class VersionUtils {
    private static int majorVersion = -1;
    private static int minorVersion = -1;

    /**
     * Return the major Minecraft version the server is running.
     * @return Server's major version.
     */
    public static int getMajorVersion() {
        // Prevent calculating the server version repeatedly.
        if(majorVersion != -1) {
            return majorVersion;
        }

        // Sets the server version if not set yet.
        final String versionString = Bukkit.getServer().getBukkitVersion().split("-")[0];
        majorVersion = Integer.parseInt(versionString.split("\\.")[1]);
        return majorVersion;
    }

    /**
     * Return the minor Minecraft version the server is running.
     * @return Server's major version.
     */
    public static int getMinorVersion() {
        // Prevent calculating the server version repeatedly.
        if(minorVersion != -1) {
            return minorVersion;
        }

        // Sets the server version if not set yet.
        final String versionString = Bukkit.getServer().getBukkitVersion().split("-")[0];
        minorVersion = Integer.parseInt(versionString.split("\\.")[2]);
        return minorVersion;
    }
}