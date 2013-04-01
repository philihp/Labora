$ ->
  jsRoutes.controllers.LaboraGame.index().ajax success: (games) ->
    $.each games, (index, game) ->
      console.log('data = ' + JSON.stringify(game))
      dust.render('game', game)
#      $('#games').append $('<li>').text game.id