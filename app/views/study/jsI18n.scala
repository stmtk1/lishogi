package views.html.study

import play.api.i18n.Lang

import lila.app.templating.Environment._
import lila.i18n.{ I18nKeys => trans }

object jsI18n {

  def apply()(implicit lang: Lang) =
    views.html.board.userAnalysisI18n(withAdvantageChart = true) ++
      i18nJsObject(i18nKeys)

  val i18nKeys: List[lila.i18n.MessageKey] = {
    import trans.study._
    List(
      trans.black,
      trans.white,
      trans.sente,
      trans.gote,
      trans.shitate,
      trans.uwate,
      trans.name,
      trans.variant,
      trans.clearBoard,
      trans.startPosition,
      trans.cancel,
      trans.chat,
      trans.pasteTheKifCsaStringHere,
      addNewChapter,
      addMembers,
      inviteToTheStudy,
      pleaseOnlyInvitePeopleYouKnow,
      searchByUsername,
      spectator,
      contributor,
      kick,
      leaveTheStudy,
      youAreNowAContributor,
      youAreNowASpectator,
      tags,
      like,
      newTag,
      commentThisPosition,
      commentThisMove,
      annotateWithGlyphs,
      theChapterIsTooShortToBeAnalysed,
      onlyContributorsCanRequestAnalysis,
      getAFullComputerAnalysis,
      makeSureTheChapterIsComplete,
      allSyncMembersRemainOnTheSamePosition,
      shareChanges,
      playing,
      first,
      previous,
      next,
      last,
      shareAndExport,
      cloneStudy,
      studyKif,
      downloadAllGames,
      chapterKif,
      chapterCsa,
      downloadGame,
      studyUrl,
      broadcastUrl,
      currentChapterUrl,
      currentGameUrl,
      youCanPasteThisInTheForumToEmbed,
      startAtInitialPosition,
      startAtX,
      embedInYourWebsite,
      readMoreAboutEmbedding,
      onlyPublicStudiesCanBeEmbedded,
      open,
      xBroughtToYouByY,
      studyNotFound,
      editChapter,
      newChapter,
      orientation,
      analysisMode,
      pinnedChapterComment,
      saveChapter,
      clearAnnotations,
      deleteChapter,
      deleteThisChapter,
      clearAllCommentsInThisChapter,
      rightUnderTheBoard,
      noPinnedComment,
      normalAnalysis,
      hideNextMoves,
      interactiveLesson,
      chapterX,
      empty,
      startFromInitialPosition,
      editor,
      startFromCustomPosition,
      loadAGameByUrl,
      loadAPositionFromSfen,
      automatic,
      urlOfTheGame,
      loadAGameFromXOrY,
      createChapter,
      configureLiveBroadcast,
      createStudy,
      editStudy,
      visibility,
      public,
      `private`,
      unlisted,
      inviteOnly,
      allowCloning,
      nobody,
      onlyMe,
      contributors,
      members,
      everyone,
      enableSync,
      yesKeepEveryoneOnTheSamePosition,
      noLetPeopleBrowseFreely,
      pinnedStudyComment,
      start,
      save,
      clearChat,
      deleteTheStudyChatHistory,
      deleteStudy,
      deleteTheEntireStudy,
      whereDoYouWantToStudyThat,
      nbChapters,
      nbGames,
      nbMembers,
      trans.rematch,
      trans.backToGame,
      trans.newOpponent
    ).map(_.key)
  }
}
