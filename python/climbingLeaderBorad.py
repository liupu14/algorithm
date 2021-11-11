#
# Complete the 'climbingLeaderboard' function below.
#
# The function is expected to return an INTEGER_ARRAY.
# The function accepts following parameters:
#  1. INTEGER_ARRAY ranked
#  2. INTEGER_ARRAY player
#

def climbingLeaderboard(ranked, player):
    currentrank = len(set(ranked))
    score_index = 0
    highscore_index = len(ranked) - 1
    while score_index != len(player):
        while player[score_index] > ranked[highscore_index] and highscore_index > -1:
            highscore_index -= 1
            if ranked[highscore_index] != ranked[highscore_index + 1]:
                currentrank -= 1
        if player[score_index] == ranked[highscore_index]:
            yield currentrank
        else:
            yield currentrank + 1
        score_index += 1


if __name__ == '__main__':
    ranked = list(map(int, input().rstrip().split()))
    player = list(map(int, input().rstrip().split()))
    result = climbingLeaderboard(ranked, player)
    for ii in result:
        print(ii)
