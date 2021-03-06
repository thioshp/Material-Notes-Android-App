package com.bijoysingh.quicknote.utils

import com.bijoysingh.quicknote.activities.external.ExportableTag
import com.bijoysingh.quicknote.database.Tag
import com.bijoysingh.quicknote.database.utils.saveIfUnique
import com.github.bijoysingh.starter.util.RandomHelper


fun genEmptyTag(): Tag {
  val tag = Tag()
  tag.uid = 0
  tag.title = ""
  tag.uuid = RandomHelper.getRandomString(24)
  return tag
}

fun genEmptyTag(exportableTag: ExportableTag): Tag {
  val tag = genEmptyTag()
  tag.uuid = exportableTag.uuid
  tag.title = exportableTag.title
  return tag
}

fun genImportedTag(exportableTag: ExportableTag): Tag {
  val tag = genEmptyTag(exportableTag)
  tag.saveIfUnique()
  return tag
}