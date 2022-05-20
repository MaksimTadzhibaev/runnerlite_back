package ru.runnerlite.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpRequest;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import ru.runnerlite.entities.dto.RunningResultDto;
import ru.runnerlite.entities.dto.TeamsRunningCountDto;
import ru.runnerlite.services.interfaces.IRunningResultsService;

import java.net.http.HttpResponse;
import java.security.Principal;
import java.util.List;

@RestController
@RequestMapping("/results")
public class RunningResultsController {

    private IRunningResultsService runningResultsService;

    @Autowired
    public RunningResultsController(IRunningResultsService runningResultsService) {
        this.runningResultsService = runningResultsService;
    }

    @GetMapping("/getAll")
    public List<RunningResultDto> getAllResults() {
        return runningResultsService.findAllResult();
    }
    
    @GetMapping("/last")
    public RunningResultDto getLastRunningResult(Principal principal) {
        String currentUserName = principal.getName();
        return runningResultsService.getLastRunningResult(currentUserName);
    }

    //Получение истории забегов по команде
    @GetMapping("/history")
    public List<TeamsRunningCountDto> getTeamRunningCountHistory(@RequestParam("teamId") Integer teamId,HttpRequest request){
        return runningResultsService.getTeamRunningResults(teamId);
    }
    
}
