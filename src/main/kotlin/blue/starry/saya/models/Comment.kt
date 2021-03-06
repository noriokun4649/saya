package blue.starry.saya.models

import kotlinx.serialization.Serializable

/**
 * DPlayer 互換のコメントモデル
 */
@Serializable
data class Comment(
    /**
     * コメントの配信元 (e.g. "lv2646436", "#twitter")
     */
    val source: String,

    /**
     * コメント番号
     */
    val no: Int,

    /**
     * コメントの投稿時間 (エポック秒)
     */
    val time: Double,

    /**
     * コメントの投稿者名 / ユーザ ID
     */
    val author: String,

    /**
     * コメントの本文
     */
    val text: String,

    /**
     * コメントの hex 表記の色 (e.g. "#123456")
     */
    val color: String,

    /**
     * コメントの位置 (e.g. "bottom")
     */
    val type: String,

    /**
     * コメントのサイズ (e.g. "medium")
     */
    val size: String,

    /**
     * コメントに紐付いたコマンド (e.g. ["red"])
     */
    val commands: List<String>
)
