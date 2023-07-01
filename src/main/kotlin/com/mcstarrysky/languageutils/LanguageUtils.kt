package com.mcstarrysky.languageutils

import org.bukkit.enchantments.Enchantment
import org.bukkit.entity.Entity
import org.bukkit.entity.Player
import org.bukkit.inventory.ItemStack
import org.bukkit.potion.PotionEffectType
import taboolib.common.LifeCycle
import taboolib.common.TabooLibCommon
import taboolib.common.platform.Awake
import taboolib.module.nms.getI18nName

/**
 * LanguageUtils
 * com.mcstarrysky.languageutils.LanguageUtils
 *
 * @author mical
 * @since 2023/7/2 12:50 AM
 */
object LanguageUtils {

    @Awake(LifeCycle.ENABLE)
    fun fix() {
        TabooLibCommon.setStopped(true)
    }

    /**
     * 获取实体对应译名
     * 如果传入玩家则通过该玩家的客户端语言获取对应译名
     *
     * @param player 玩家
     * @param entity 实体
     * @return String
     */
    @JvmStatic
    fun getName(player: Player?, entity: Entity): String {
        return entity.getI18nName(player)
    }

    /**
     * 获取物品对应译名
     * 如果传入玩家则通过该玩家的客户端语言获取对应译名
     *
     * @param player    玩家
     * @param itemStack 物品
     * @return String
     */
    @JvmStatic
    fun getName(player: Player?, itemStack: ItemStack): String {
        return itemStack.getI18nName(player)
    }

    /**
     * 获取附魔对应译名
     * 如果传入玩家则通过该玩家的客户端语言获取对应译名
     *
     * @param player      玩家
     * @param enchantment 附魔
     * @return String
     */
    @JvmStatic
    fun getName(player: Player?, enchantment: Enchantment): String {
        return enchantment.getI18nName(player)
    }

    /**
     * 获取药水效果对应译名
     * 如果传入玩家则通过该玩家的客户端语言获取对应译名
     *
     * @param player           玩家
     * @param potionEffectType 药水效果
     * @return String
     */
    @JvmStatic
    fun getName(player: Player?, potionEffectType: PotionEffectType): String {
        return potionEffectType.getI18nName(player)
    }

    /**
     * 获取实体对应中文译名
     *
     * @param entity 实体
     * @return String
     */
    @JvmStatic
    fun getName(entity: Entity): String {
        return getName(null, entity)
    }

    /**
     * 获取物品对应译名
     *
     * @param itemStack 物品
     * @return String
     */
    @JvmStatic
    fun getName(itemStack: ItemStack): String {
        return getName(null, itemStack)
    }

    /**
     * 获取附魔对应中文译名
     *
     * @param enchantment 实体
     * @return String
     */
    @JvmStatic
    fun getName(enchantment: Enchantment): String {
        return getName(null, enchantment)
    }

    /**
     * 获取药水效果对应译名
     *
     * @param potionEffectType 药水效果
     * @return String
     */
    @JvmStatic
    fun getName(potionEffectType: PotionEffectType): String {
        return getName(null, potionEffectType)
    }
}